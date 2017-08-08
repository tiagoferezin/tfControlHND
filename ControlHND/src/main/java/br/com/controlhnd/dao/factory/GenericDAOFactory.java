/**
 * 
 */
package br.com.controlhnd.dao.factory;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.validation.ConstraintViolationException;

import br.com.controlhnd.dao.GenericDAO;
import br.com.controlhnd.model.entity.AEntity;
import br.com.controlhnd.utils.NameValuePair;

/**
 * @author Tiago Ferezin
 *
 */
public class GenericDAOFactory {

	public void create(AEntity entity, EntityManager entityManager) throws ConstraintViolationException, Exception {

		GenericDAO result = new GenericDAO(entity, entityManager);
		result.create();
	}

	public void readAll(AEntity entity, EntityManager entityManager, Boolean ativos) throws Exception {

		GenericDAO result = new GenericDAO(entity, entityManager);
		result.readAll(entity, entityManager, ativos);

	}

	public AEntity readPorId(AEntity entity, EntityManager entityManager, Long id) throws Exception {

		List<AEntity> list = new ArrayList<AEntity>();

		String where = "(t.id = :id)";

		List<NameValuePair> whereParameters = new ArrayList<NameValuePair>();

		whereParameters.add(new NameValuePair("id", id));
		list = read(entity, entityManager, where, whereParameters, 0, 0, "", "");

		AEntity result = entity.getClass().newInstance();

		if ((list != null) && (list.size() > 0)) {
			result = list.get(0);
		}

		return result;

	}

	public List<AEntity> read(AEntity entity, EntityManager entityManager, String where,
			List<NameValuePair> whereParameters, Integer initialRecord, Integer amountRecord, String orderColumn,
			String orderDirection) throws Exception {
		List<AEntity> list = new ArrayList<AEntity>();
		list = read(entity, entityManager, where, whereParameters, initialRecord, amountRecord, orderColumn,
				orderDirection, true);
		return list;
	}

	public List<AEntity> read(AEntity entity, EntityManager entityManager, String where,
			List<NameValuePair> whereParameters, Integer initialRecord, Integer amountRecord,
			List<NameValuePair> orderBy, Boolean registrosAtivos) throws Exception {

		GenericDAO dao = new GenericDAO(entity, entityManager);
		List<AEntity> list = dao.read(entity, entityManager, where, whereParameters, initialRecord, amountRecord,
				orderBy, true);

		return list;

	}

	public List<AEntity> read(AEntity entity, EntityManager entityManager, String where,
			List<NameValuePair> whereParameters, Integer initialRecord, Integer amountRecord, String orderColumn,
			String orderDirection, Boolean registrosAtivos) throws Exception {

		List<AEntity> list = new ArrayList<AEntity>();

		List<NameValuePair> orderBy = new ArrayList<NameValuePair>();

		if ((orderColumn != null) && (!orderColumn.isEmpty())) {
			if ((orderDirection == null) || (orderDirection.isEmpty())) {
				orderDirection = "asc";
			}

			orderBy.add(new NameValuePair(orderColumn, orderDirection));
		}

		list = read(entity, entityManager, where, whereParameters, initialRecord, amountRecord, orderBy, true);

		return list;

	}

	public List<AEntity> readAllActives(AEntity entity, EntityManager entityManager) throws Exception {
		List<AEntity> list = new ArrayList<AEntity>();

		list = read(entity, entityManager, 0, 0, null, null);

		return list;

	}

	public List<AEntity> readAll(AEntity entity, EntityManager entityManager) throws Exception {
		List<AEntity> list = new ArrayList<AEntity>();
		List<NameValuePair> whereParameters = new ArrayList<NameValuePair>();
		whereParameters.clear();
		list = read(entity, entityManager, null, whereParameters, false);
		return list;
	}

	public List<AEntity> read(AEntity entity, EntityManager entityManager, Integer initialRecord, Integer amountRecord,
			String orderColumn, String orderDirection) throws Exception {
		List<AEntity> list = new ArrayList<AEntity>();

		list = read(entity, entityManager, null, null, initialRecord, amountRecord, orderColumn, orderDirection);

		return list;

	}

	public List<AEntity> read(AEntity entity, EntityManager entityManager, String where) throws Exception {
		List<AEntity> list = new ArrayList<AEntity>();

		list = read(entity, entityManager, where, null, 0, 0, null, null, null);

		return list;

	}

	public List<AEntity> read(AEntity entity, EntityManager entityManager, String where,
			List<NameValuePair> whereParameters) throws Exception {
		List<AEntity> list = new ArrayList<AEntity>();

		list = read(entity, entityManager, where, whereParameters, 0, 0, null, null, null);

		return list;

	}

	public List<AEntity> read(AEntity entity, EntityManager entityManager, String where,
			List<NameValuePair> whereParameters, List<NameValuePair> orderBy) throws Exception {
		List<AEntity> list = new ArrayList<AEntity>();

		list = read(entity, entityManager, where, whereParameters, 0, 0, orderBy, true);

		return list;

	}

	public List<AEntity> read(AEntity entity, EntityManager entityManager, String where,
			List<NameValuePair> whereParameters, Boolean registrosAtivos) throws Exception {
		List<AEntity> list = new ArrayList<AEntity>();

		list = read(entity, entityManager, where, whereParameters, 0, 0, null, null, registrosAtivos);

		return list;

	}

	public void update(AEntity entity, EntityManager entityManager) throws ConstraintViolationException, Exception {

		GenericDAO result = new GenericDAO(entity, entityManager);
		result.update();

	}

	public void delete(AEntity entity, EntityManager entityManager) throws ConstraintViolationException, Exception {

		GenericDAO result = new GenericDAO(entity, entityManager);
		result.delete();

	}

}
